My answer of the "one-liner-sum" question is:
Take test.txt for example
Code: cat test.txt | awk '{sum+=$1} END {print sum}'