#!/bin/bash
let iconindex=1
let baseitemid=25000
cd ..
for filename in *.png; do
	echo "Sign"_"${filename%.*}"" = new ItemSignCustom("$baseitemid", Blocks.Sign"_"${filename%.*}"_"Post, Blocks.Sign"_"${filename%.*}"_"Wall).setTextureFile(\"/eyecandycraft/textures/signs/icons/signs.png\").setIconIndex("$iconindex").setItemName(\"Sign"_"${filename%.*}\");"
        let "baseitemid=baseitemid+1"
        let "iconindex=iconindex+1"
done
