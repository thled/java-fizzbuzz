{ pkgs ? import <nixpkgs> { } }:
pkgs.mkShell {
  buildInputs = with pkgs; [
    gradle
    jdk17_headless
    watchexec
  ];
}
