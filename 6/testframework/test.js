
(function(){

var fb = new FizzBuzz();
	assert('should return 1 as 1', function(){
		
		var result = fb.calculateFizzbuzz(1);
		expect(result).toEqual("1");
	});

	assert('should return fizz',function(){
		
		var result = fb.calculateFizzbuzz(3);
		expect(result).toEqual("fizz");
	});

	assert('should return buzz', function(){
		
		var result = fb.calculateFizzbuzz(10);
		expect(result).toEqual("buzz");
	});

	assert("should return fizzbuzz divisible by 3 and 5", function () {
		var result = fb.calculateFizzbuzz(15);
		expect(result).toEqual("fizzbuzz");
	});

	assert("should return fizz when has 3 in it", function () {
		var result =fb.calculateFizzbuzz(23);
		expect(result).toEqual("fizz");
	});

}());