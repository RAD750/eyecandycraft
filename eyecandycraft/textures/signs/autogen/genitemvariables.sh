#!/bin/bash
cd ..
for filename in *.png; do
	echo "public static Item Sign"_"${filename%.*}"";"
done
