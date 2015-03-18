var FizzBuzz = function() {
	this.calculateFizzbuzz = function(nr) {
		var tre = 3;
		var fem = 5;

		if(nr % tre === 0 && nr % fem === 0){
			return "fizzbuzz";
		}
		else if(nr % tre === 0) {
			return "fizz";
		}else if (nr % fem === 0){
			return "buzz";
		}else if (this.containsValue(nr, tre)){
			return "fizz";
		}
		else {
			return nr.toString();
		}
	}

	this.containsValue = function(numberToSearchIn, numberToSearchFor) {
		var nr = numberToSearchIn.toString();
		var index = nr.indexOf(numberToSearchFor);
		return index > -1;
	}
	
};