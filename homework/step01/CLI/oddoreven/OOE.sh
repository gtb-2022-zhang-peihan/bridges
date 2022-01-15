#!/bin/bash
number=`expr $1 % 2`
if [[ $number = 1  ]];then
    echo "odd";
else
    echo "even";
    fi
