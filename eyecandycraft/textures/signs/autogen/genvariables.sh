#!/bin/bash
cd ..
for filename in *.png; do
	echo "public static Block Sign"_"${filename%.*}"_"Post;"
	echo "public static Block Sign"_"${filename%.*}"_"Wall;"
done
