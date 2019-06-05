# Springfox 3.0.0-Snapshot Model Name Generation Issue

## What is the problem?

From the May 27, 2019 update, suffix with number like `_1`, `_2` has been added some duplicated entities model name. 

## How to run?

```bash
$ gradlew bootRun
```

Open http://localhost:8080/swagger-ui.html and check the **Models** section on the bottom.

## Branches

- **master**: Use latest 3.0.0-SNAPSHOT version which has a issue. (May 27, 2019)
- **previous**: Use previous version of 3.0.0-SNAPSHOT, which was okay. (Feb 26, 2019)
