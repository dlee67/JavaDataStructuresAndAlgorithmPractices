function error = cost_function(input, targetOutput, theta, length)
	error = symsum((h_function(input)-targetOutput)^2, 1, length) 
endfunction 