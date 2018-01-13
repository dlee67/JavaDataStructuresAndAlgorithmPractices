A = [16 2 3 13; 5 11 10 8; 9 7 6 12; 4 14 15 1]
B = [16 2; 5 11; 9 7; 4 14]

B=A(:, 1:2);
disp(B)
printf("\n");
B=A(1:4, 1:2);
disp(B)
printf("\n");
B=A(1:2, 1:4);
disp(B)
printf("\n");