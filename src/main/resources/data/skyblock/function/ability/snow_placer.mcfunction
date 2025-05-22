execute if block ~ ~ ~ minecraft:snow[layers=7] run setblock ~ ~ ~ snow[layers=8]
execute if block ~ ~ ~ minecraft:snow[layers=6] run setblock ~ ~ ~ snow[layers=7]
execute if block ~ ~ ~ minecraft:snow[layers=5] run setblock ~ ~ ~ snow[layers=6]
execute if block ~ ~ ~ minecraft:snow[layers=4] run setblock ~ ~ ~ snow[layers=5]
execute if block ~ ~ ~ minecraft:snow[layers=3] run setblock ~ ~ ~ snow[layers=4]
execute if block ~ ~ ~ minecraft:snow[layers=2] run setblock ~ ~ ~ snow[layers=3]
execute if block ~ ~ ~ minecraft:snow[layers=1] run setblock ~ ~ ~ snow[layers=2]
execute unless block ~ ~ ~ minecraft:snow run setblock ~ ~ ~ snow[layers=1]
playsound minecraft:block.snow.place player @s ~ ~ ~ 1.0 1.0