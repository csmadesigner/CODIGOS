const fs = require('fs');
const path = require('path');
const hoje = new Date();
const folderPath = 'C:/Users/Carlos Mota Pro/Downloads/Musicas de Pascoa'; // Substitua pelo caminho da sua pasta
const baseName = 'PascoaMusica'; // Nome base dos arquivos

fs.readdir(folderPath, (err, files) => {
    if (err) {
        console.error('Erro ao ler a pasta:', err);
        return;
    }

    files.forEach((file, index) => {
        const oldPath = path.join(folderPath, file);
        const ext = path.extname(file);
        const newName = `${baseName}${index + 1}${ext}`;
        const newPath = path.join(folderPath, newName);

        fs.rename(oldPath, newPath, (err) => {
            if (err) {
                console.error(`Erro ao renomear ${file}:`, err);
            } else {
                console.log(`Renomeado: ${file} → ${newName}`);
            }
        });
    });
});