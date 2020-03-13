var MaiorSequencia = function(arr){

  var max_ATUAL = 0, max_TOTAL = 0;

  for(var i = 0; i < arr.length; i++){  
    max_ATUAL = Math.max(0, max_ATUAL + arr[i]);
    max_TOTAL = Math.max(max_ATUAL, max_TOTAL);
  }
  return max_TOTAL;
}

console.log(MaiorSequencia([ -12,6,-7,-8,1,-10,13,-14,-5,9,12,19,-17,19,0,-15,17,-12,-4,-4]));