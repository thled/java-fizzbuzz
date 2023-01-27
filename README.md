# TDD Kata: FizzBuzz in Java

## Kata

1. Write a “fizzBuzz” method that accepts a number as input and returns it as a String.
1. For multiples of three return “Fizz” instead of the number
1. For the multiples of five return “Buzz”
1. For numbers that are multiples of both three and five return “FizzBuzz”.

## Requirements

### Plain

- [JDK][jdk]
- [Watchexec][watcher] (optional)

### Nix

- [Nix][nix]
- [direnv][direnv] (optional)

## Usage

- Run tests: `./gradlew test`
- Watch tests: `watchexec -rc -w src -- './gradlew test --console rich'`

[jdk]: https://www.oracle.com/java/technologies/downloads/#java17
[watcher]: https://github.com/watchexec/watchexec#install
[nix]: https://nixos.org/download.html
[direnv]: https://nixos.org/download.html
