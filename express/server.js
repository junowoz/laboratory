//Uma grande porção dos dados na internet viaja entre protocolos HTTP/HTTPS por meio de ciclos de request-response entre clientes e servidores. Express é um framework para criar servidores-web e APIs.
//Express é um módulo do Node.
const e = require("express");
const express = require("express");

// Um servidor ouve requisições (requests)

// Uma vez o servidor está ouvindo, ele pode responder a qualquer requisição (quando alguém toca a porta dele pedindo algo).
// Mas, ele deve saber o que fazer com esses pedidos. Para isso definimos rotas, usando o verbo HTTP.

// A rota, por exemplo, seria "monsters", em "localhost:3000/monsters". Isto seria uma rota.
// O HostName é localhost
// O porto é 3000
// O HTTP Verb pode ser GET, POST, PUT, ETC.

// Instância de express
const app = express();

// Rota onde iremos ouvir
const PORT = 3000;

// Middleware para servir arquivos estáticos
app.use(express.static("public"));

// Gets usualmente pegam dois parâmetros. Um path (usualmente string), e uma função de call-back para fazer handle de requests e enviar uma resposta.
// Com a instância e o modulo get. Quer dizer que quando o usuário acessar (GET) a rota /expressions, ele ira receber
// uma (res) responsta, neste caso um array

const expressions = ["1", "2", "3"];
app.get("/expressions", (req, res, next) => {
  res.send(expressions[0]);
});

// Tudo funciona em 1 ida, uma volta, um request e um response.
// o .send pega o que estiver dentro dele e envia como resposta para o cliente.

// quando mando um request a uma rota especifica, express vai e procura, e a primeira que aparecer, ele envia uma resposta.
// se não houver nenhuma rota, ele envia um erro 404.

////////////////////////////////////////////////////////////////

// Usando WILDCARDS
// Wildcards são uma forma de expressar que queremos pegar qualquer coisa que venha depois de um certo path.
// uso :nome-da-rota-slug

app.get("/expressions/:id", (req, res) => {});

const monsters = {
  dragon: { height: 200, age: 350 },
  hydra: { height: 3, age: 4 },
};
// GET /monsters/dragon

// ou seja, aqui eu digo que depois de monsters, vou escrever qualquer coisa, e o nome desse parametro sera nameOfMonster.
// eu poderia escrever por exempro /monsters/dragon, e o parametro seria dragon. E eu poderia acessar o objeto monsters com esse parametro.
// ou seja, :nameOfMonster e um wildcard, que pega qualquer coisa que venha depois de /monsters/, neste caso, dragon.

app.get("/monsters/:nameOfMonster", (req, res, next) => {
  // params serve para pegar os parametros que vem na request, ou seja, o que e pedido para o get.
  console.log(req.params); // { nameOfMonster: 'dragon' }

  // aqui eu pego o parametro que vem na request, e uso ele para acessar o objeto monsters.
  res.send(monsters[req.params.nameOfMonster]); //monsters['dragon']
});

//////////////////////////////////
//status codes são formas de dar informações ao cliente
//sobre o status da nossa requisição
//200 - OK
//404 - Not Found
//500 - Internal Server Error

// para ver um status use res.status(numeroDosTATUS)
// pra imprimir uma mensagem junto com o status res.status(numberOfStatus).send('message')

const monsterStoreInventory = {
  fenrirs: 4,
  banshees: 1,
  jerseyDevils: 4,
  krakens: 3,
};

app.get("/monsters-inventory/:name", (req, res, next) => {
  const monsterInventory = monsterStoreInventory[req.params.name];

  if (monsterInventory) {
    res.send(monsterInventory);
  } else {
    res.status(404).send("Monster not found");
  }
});

// também temos o PUT, POST E DELETE
// PUT serve para atualizar algo que já existe no bd
// POST serve para criar algo no bd
// DELETE serve para deletar algo

//query strings
// dada a rota /monsters/1?name=chimera&age=1
// uma query string seria name=chimera&age=1, ou seja, o qu vem depois do ?
// ela não faz parte da rota; é interpretada como um objeto js e é passada junto ao corpo da request
// na forma de req.query (forma de acessar a query string)

// a relação key: value, em query strings é feita com =
// e key: value pairs são com &

const pets = { 1: { name: "dog", age: "4" } };

// PUT /pets/1?name=chimera&age=1
app.put("/pets/:id", (req, res, next) => {
  const petsUpdates = req.query; //pego e salvo a query da request (name=chimera&age=1)
  pets[req.params.id] = petsUpdates; //pegar o id (que é 1), e mudar pelo req.query, que é name=chimera&age=1
  res.send(pets[req.params.id]); //envio o novo id, que era 1 e agora é o objeto da query string
});

//Para o id eu pero req.params.id
//Para a query, é req.query
// relembrando que a query não faz parte da rota, ela é interpretada como um objeto js e é passada junto ao corpo da request.

//POST: Serve para criar novos recursos no servidor. Sua rota termina com o tipo de recursos a ser criado, não com um parâmetro.
//para criar um novo pet ou monstro, ele iria diretamente a /pets ou /monsters, e não /pets/1 ou /monsters/dragon
// o estatus para quando algo é criado é 201 - Created

app.post("/monsters", (req, res, next) => {
  const receivedExpression = createElement("monsters", req.query);
  monsters.push(receivedExpression); //o push adiciona um novo elemento ao array
});

//DELETE: Serve para deletar recursos no servidor. Sua rota deve terminar com um parâmetro, que é o recurso a ser deletado.
// o status para quando algo é deletado é 204 - No Content
// o splice serve para deletar um elemento de um array

app.delete("/monsters/:id", (req, res, next) => {
  const expressionIndex = getIndexById(req.params.id, monsters);
  monsters.splice(expressionIndex, 1);
});

// Rota de exemplo onde usamos o modulo listen na instancia do express, para ouvir um certo porto (3000)
app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});
