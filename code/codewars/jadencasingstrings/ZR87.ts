String.prototype.toJadenCase = function () {
  return this.replace(/(?:^|\s)\S/g, firstLetter => firstLetter.toUpperCase());
};
