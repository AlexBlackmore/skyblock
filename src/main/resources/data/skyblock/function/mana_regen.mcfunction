execute unless score @s mana matches 0.. run scoreboard players set @s mana 0
execute store result score @s dummy run attribute @s minecraft:intelligence get
execute store result score @s dummy1 run attribute @s minecraft:intelligence get 0.02
execute if score @s mana < @s dummy run scoreboard players operation @s mana += @s dummy1
execute if score @s mana > @s dummy run scoreboard players operation @s mana = @s dummy
execute if score @s mana < @s dummy run title @s actionbar {"translate":"hud.skyblock.mana","with":[{"score":{"name":"@s","objective":"mana"}},{"score":{"name":"@s","objective":"dummy"}}],"color":"dark_aqua"}