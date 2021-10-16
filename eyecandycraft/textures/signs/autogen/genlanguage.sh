#!/bin/bash
cd ..
for filename in *.png; do
	echo "LanguageRegistry.addName(\"Sign"_"${filename%.*}""\", \"Vanilla Sign\");"
done
