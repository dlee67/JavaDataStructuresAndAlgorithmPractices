%In Octave, if you want to have a value be returned from the function,
%it needs to be defined in the function header.
function retval = h_function (theta, input)
	retval = theta(1,1) + theta(1,2)*input
endfunction 