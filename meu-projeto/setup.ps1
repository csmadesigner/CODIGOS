# Criando estrutura de diretórios
New-Item -ItemType Directory -Path meu-projeto/backend,meu-projeto/frontend,meu-projeto/database,meu-projeto/nginx,meu-projeto/volumes -Force
Set-Location meu-projeto

Write-Output "Criando arquivo .env"
@"
MYSQL_ROOT_PASSWORD=root
MYSQL_DATABASE=meu_banco
MYSQL_USER=user
MYSQL_PASSWORD=senha
"@ | Set-Content .env

Write-Output "Criando configuração do NGINX"
@"
server {
    listen 80;
    server_name localhost;

    location / {
        proxy_pass http://node:3000;
        proxy_set_header Host \$host;
        proxy_set_header X-Real-IP \$remote_addr;
        proxy_set_header X-Forwarded-For \$proxy_add_x_forwarded_for;
    }
}
"@ | Set-Content nginx/nginx.conf

Write-Output "Criando docker-compose.yml"
@"
version: '3.8'

services:
  mysql:
    image: mysql:8
    container_name: meu-mysql
    restart: always
    environment:
      MYSQL_ROOT_PASSWORD: \${MYSQL_ROOT_PASSWORD}
      MYSQL_DATABASE: \${MYSQL_DATABASE}
      MYSQL_USER: \${MYSQL_USER}
      MYSQL_PASSWORD: \${MYSQL_PASSWORD}
    ports:
      - "3306:3306"
    volumes:
      - ./volumes/mysql_data:/var/lib/mysql

  node:
    image: node:18
    container_name: meu-node
    working_dir: /app
    volumes:
      - ./backend:/app
    ports:
      - "3000:3000"
    command: sh -c "npm install && npm start"
    depends_on:
      - mysql

  python:
    image: python:3.10
    container_name: meu-python
    working_dir: /app
    volumes:
      - ./backend:/app
    command: tail -f /dev/null

  nginx:
    image: nginx:latest
    container_name: meu-nginx
    volumes:
      - ./nginx/nginx.conf:/etc/nginx/conf.d/default.conf
    ports:
      - "80:80"
    depends_on:
      - node

  adminer:
    image: adminer
    container_name: meu-adminer
    restart: always
    ports:
      - "8080:8080"
    depends_on:
      - mysql

volumes:
  mysql_data:
"@ | Set-Content docker-compose.yml

Write-Output "Subindo os containers..."
docker-compose up -d

Write-Output "Setup concluído!"
