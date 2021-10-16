#!/bin/bash
cd ..
let baseid=3230
let baseitemid=25000
for filename in *.png; do
	echo "Sign"_"${filename%.*}"_"Post = new SignCustomBlock("$baseid", true, "$baseitemid", null, \"/eyecandycraft/textures/signs/$filename\");"
	let "baseid=baseid+1"
	let "baseitemid=baseitemid+1"
	echo "Sign"_"${filename%.*}"_"Wall = new SignCustomBlock("$baseid", false, "$baseitemid", Sign"_"${filename%.*}"_"Post, \"/eyecandycraft/textures/signs/$filename\");"
	let "baseid=baseid+1"
done
