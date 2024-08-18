# NEST

Um superset de Node.js. It uses express under the hood and contains batteries, meaning it has a lot of functions. It works for monolithic and micro services too.

## Files
- @nestjs/platform-express defines express as the default HTTP server in a nest app
- /nest-cli.json holds the metadata to build, organize or deploy nest apps.

`nest start:dev` for starting the project watching changes

The nest app starts at the main.ts, inside /src. Main.ts load the AppModule, that is imported from /src/app.module.ts

## Building Blocks of a Nest.js App
We have 3 major components. Modules, Controllers and Providers

###  Modules (AppModule) [app.module.ts]
Is a class using the @Module decorator, in which we also import AppService [app.service] and AppControler [app.controler]. The app module serves as a file where the call other files, it’s like the index of the project. Transforms a class into a module.

@Module() decorar serves as a root module that is an entry point to resolve the structure and relationships. It is highly recommended to have multiple modules to organize your application’s components.

Here developers define metadata about a class. This registers many modules to the Nest App.

### Controller (AppController) [app.controler.ts]
A class created using the @Controller decorator. It transforms a class into a Controller.

### Provider (AppService) [app.service.ts]
A class created using the @Injectable annotation. This serves as a provider

## Decorators

- @Module() transforms a class into a module.
- @Controller()transforms a class into a controller.
- @Injectable() transforms a class into a provider.