A = eye(10)
x = [1; 1; 1; 1; 1; 1; 1; 1; 1; 1]
v = zeros(10, 1);
for i = 1:10
  for j = 1:10
    v(i) = v(i) + A(i, j) * x(j);
  end
end

disp(v)
printf("Above my first v.\n");
v=A*x;
disp(v)
printf("Above A*x\n");
printf("\n");
v=x'*A;
disp(v)
printf("Above x'*A\n");
v=sum(A*x);
disp(v)
printf("Above sum(A*x)")