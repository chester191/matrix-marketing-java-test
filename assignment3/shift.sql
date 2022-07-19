/* Assume a variable has been passed in from another
   Language into the sql statement
   call it _x*/
   
UPDATE schedule SET Year = Year + 1 WHERE (Week+_x) > 52;
UPDATE schedule SET Week = (Week +_x)%52;
