const express = require("express");
const app = express();

const PORT = process.env.PORT || 4001;

const currencies = {
  diram: {
    countries: ["UAE", "Morocco"],
  },
  real: {
    countries: ["Brazil"],
  },
  dinar: {
    countries: ["Algeria", "Bahrain", "Jordan", "Kuwait"],
  },
  vatu: {
    countries: ["Vanuatu"],
  },
  shilling: {
    countries: ["Tanzania", "Uganda", "Somalia", "Kenya"],
  },
};

app.put("/currencies/:name/countries", (req, res, next) => {
  const currencyName = req.params.name; //Params takes the literal url
  const countries = req.query; //Query takes the query string sent
  currencies[currencyName] = countries;
  res.send(currencies[currencyName]);
});

//////////////////////////////

const soups = ["gazpacho", "borscht", "primordial", "avgolemono", "laksa"];

app.post("/soups", (req, res, next) => {
  const soupName = req.query.name;
  soups.push(soupName);
  res.status(201).send(name);
});

//////////////////////////////

const puddingFlavors = ["chocolate", "banana", "butterscotch", "pistachio"];

const findPuddingIndex = (name) => {
  return puddingFlavors.indexOf(name);
};

const deletePuddingAtIndex = (index) => {
  puddingFlavors.splice(index, 1);
};

app.delete("/puddings/:flavor", (req, res, next) => {
  const puddingsFlavor = findPuddingIndex(req.params.flavor);
  if (puddingsFlavor !== -1) {
    deletePuddingAtIndex(puddingsFlavor);
    res.status(204).send();
  } else {
    res.status(404).send();
  }
});

/////////////////////////////

const pastas = ["agnolotti", "cavatelli", "gemelli", "tortellini"];

app.get("/pastas", (req, res, next) => {
  res.send(pastas);
});

const sauceRouter = express.Router();
// Add your code here:
app.use("/sauces", sauceRouter);

const sauces = [
  "carbonara",
  "primavera",
  "bolognese",
  "puttanesca",
  "fra diavolo",
];

sauceRouter.get("/", (req, res, next) => {
  res.send(sauces);
});

////////////////////////////

const mountains = ["denali", "olympus", "kilimanjaro", "matterhorn"];
const mountainRanges = ["alps", "andes", "himalayas", "rockies"];

const mountainsRouter = express.Router();
const mountainRangesRouter = express.Router();

app.use("/mountains", mountainsRouter);
app.use("/mountain-ranges", mountainRangesRouter);

mountainsRouter.get("/", (req, res, next) => {
  res.send(mountains);
});

mountainRangesRouter.get("/", (req, res, next) => {
  res.send(mountainRanges);
});

////////////////////////////

app.listen(PORT, () => {
  console.log(`Server is listening on port ${PORT}`);
});
