v = [1; 1; 1; 1; 1; 1; 1]
w = [1; 1; 1; 1; 1; 1; 1]
z = 0;
for i = 1:7
  z = z + v(i) * w(i)
end

z=sum(v.*w);
disp(z)
printf("Above v.*w\n");
z=w'*v;
disp(z)
printf("Above w'*v\n");
