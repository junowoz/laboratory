// A way to get code to run every time without repeating it
// MIddleweare is code that runs between the request and the response
// It runs on the bondary of the HTTP actions.

// Inspects requests, performs logic, attaches information to the response.

// Every time a request is made, the middleware will run.
// An express application is a series of middleware function calls.
app.use((req, res, next) => {
  console.log(`${req.method} Request received`);
});

// next() - always called at the end of the middleware function.
// The chain of middleware functions is called the middleware stack.
// This all runs in the order that it is written.
// Express middlewares have req, res and next.
// Next is a function that when called, will move to the next middleware in the stack.
// Express routes like get, post... are middlewares!

app.use((req, res, next) => {
  console.log(`${req.method} Request received`);
  next();
});

// app.use() middleware implementation on routes - SINGLE PATH
// this will run on every request to the /sorcerer endpoint
// it is ONLY for /sorcerer, not /sorcerer/1 or /sorcerer/2
app.use("/sorcerer", (req, res, next) => {
  console.log("User has hit endpoint /sorcerer");
  next();
});

// Writin next() at the end of every middleware is important for security reasons
// lets imagine we check if a user is logged in. We put the condition in the middleware
// and only if the user is logged in, then, at the end, next() is called.
// next() is completely up to the case. We want to have control flow.

// app.use() middleware implementation on routes - MULTIPLE PATHS
