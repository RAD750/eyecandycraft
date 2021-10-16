#!/bin/bash
cd ..
let baseid=3230
let baseitemid=25000
for filename in *.png; do
	echo "GameRegistry.registerBlock(Sign"_"${filename%.*}"_"Post, \"Sign"_"${filename%.*}"_"Post\");"
	echo "GameRegistry.registerBlock(Sign"_"${filename%.*}"_"Post, \"Sign"_"${filename%.*}"_"Wall\");"
done
