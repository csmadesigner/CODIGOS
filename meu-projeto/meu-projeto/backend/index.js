const express = require('express');
const app = express();

app.get('/', (req, res) => {
    res.send('Servidor Node rodando dentro do Docker!');
});

app.listen(3000, () => {
    console.log('Servidor rodando na porta 3000');
});
