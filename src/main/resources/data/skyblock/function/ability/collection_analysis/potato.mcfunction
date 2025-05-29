scoreboard players set @s dummy 0
execute unless data entity @s SelectedItem.components.minecraft:attribute_modifiers[{id:"skyblock:collection_analysis_potato"}].amount run item modify entity @s weapon.mainhand skyblock:collection_analysis/potato
execute store result score @s dummy1 run data get entity @s SelectedItem.components.minecraft:attribute_modifiers[{id:"skyblock:collection_analysis_potato"}].amount 100
scoreboard players add @s dummy1 1
scoreboard players set @s dummy 8
scoreboard players operation @s dummy1 /= @s dummy

scoreboard players set @s dummy 0
execute if score @s collection_potato matches 10..99 run scoreboard players set @s dummy 1
execute if score @s collection_potato matches 100..999 run scoreboard players set @s dummy 2
execute if score @s collection_potato matches 1000..9999 run scoreboard players set @s dummy 3
execute if score @s collection_potato matches 10000..99999 run scoreboard players set @s dummy 4
execute if score @s collection_potato matches 100000..999999 run scoreboard players set @s dummy 5
execute if score @s collection_potato matches 1000000..9999999 run scoreboard players set @s dummy 6
execute if score @s collection_potato matches 10000000..99999999 run scoreboard players set @s dummy 7
execute if score @s collection_potato matches 100000000..999999999 run scoreboard players set @s dummy 8
execute if score @s collection_potato matches 1000000000.. run scoreboard players set @s dummy 9

execute if score @s dummy > @s dummy1 run item modify entity @s weapon.mainhand skyblock:collection_analysis/potato