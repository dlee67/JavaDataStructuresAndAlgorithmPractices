function J = computeCost(X, y, theta)
%COMPUTECOST Compute cost for linear regression
%   J = COMPUTECOST(X, y, theta) computes the cost of using theta as the
%   parameter for linear regression to fit the data points in X and y

%These matrices are not indexed properly===================================
printf("X is: "); disp(X);
printf("y is: "); disp(y);
printf("theta is: "); disp(theta);

% Initialize some useful values
m = length(y); % number of training examples
hypothesis = theta(1,1) + theta(1,2)

% ====================== YOUR CODE HERE ======================
% Instructions: Compute the cost of a particular choice of theta
%               You should set J to the cost.

for %in some loop...
theta(1,1) % I have to constantly update both of them.
theta(1,2) % I have to constantly update both of them.	
endfor

% Argument for the summation.
sum_arg = (theta'*X-y)^2;
% The actual summation.
sum_all = syssum(sum_arg, 1, m);
% You need to return the following variables correctly 
J = (1/(2*m))*sum_all;

% =========================================================================

end
