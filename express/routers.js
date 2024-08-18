//2 - Routers são formas de organizar o código em arquivos separados.
// ele fornece uma serie de metodos. Para criar uma instancia de um, usamos .Router() no top-level import.
// para usar um router, usamos app.use() e passamos o caminho e o router.

//monsters.js
//este arquivo é um router que lida com requisições para /monsters/:id
//um arquivo separado é criado para cada recurso.

const express = require("express");
const monstersRouter = express.Router();

const monsters = {
  1: {
    name: "godzilla",
    age: 250000000,
  },
  2: {
    name: "manticore",
    age: 21,
  },
};

monstersRouter.get("/:id", (req, res, next) => {
  const monster = monsters[req.params.id];
  if (monster) {
    res.send(monster);
  } else {
    res.status(404).send();
  }
});

module.exports = monstersRouter;

// main.js
//aqui, o router é importado e usado com app.use()
const express = require("express");
const app = express();
const monstersRouter = require("./monsters.js");

app.use("/monsters", monstersRouter);
