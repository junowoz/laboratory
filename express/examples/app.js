const express = require('express');
const app = express();

app.get('/', (req, res) => {
  // Define um cookie simples
  res.cookie('nome da cookie de teste', 'valor da cookie de test', { httpOnly: true });

  // Envio de Headers personalizados
  res.set('X-Custom-Header', 'valorPersonalizado');

  // Envia uma resposta com um texto simples
  res.send('Olá, mundo! Verifique os headers para mais detalhes.');
});

app.listen(3000, () => {
  console.log('Servidor rodando na porta 3000');
});
