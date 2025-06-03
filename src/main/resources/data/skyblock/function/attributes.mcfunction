scoreboard players set @s dummy 100

execute store result score @s fortune_mining run attribute @s minecraft:fortune_mining get
execute store result score @s fortune_remainder_mining run attribute @s minecraft:fortune_mining get 100
scoreboard players operation @s fortune_remainder_mining %= @s dummy

execute store result score @s fortune_ore run attribute @s minecraft:fortune_ore get
execute store result score @s fortune_remainder_ore run attribute @s minecraft:fortune_ore get 100
scoreboard players operation @s fortune_remainder_ore %= @s dummy
scoreboard players operation @s fortune_ore += @s fortune_mining
scoreboard players operation @s fortune_remainder_ore += @s fortune_remainder_mining
execute unless score @s fortune_remainder_ore matches 100.. run scoreboard players remove @s fortune_ore 1
execute if score @s fortune_remainder_ore matches 100.. run scoreboard players operation @s fortune_remainder_ore %= @s dummy

execute store result score @s fortune_block run attribute @s minecraft:fortune_block get
execute store result score @s fortune_remainder_block run attribute @s minecraft:fortune_block get 100
scoreboard players operation @s fortune_remainder_block %= @s dummy
scoreboard players operation @s fortune_block += @s fortune_mining
scoreboard players operation @s fortune_remainder_block += @s fortune_remainder_mining
execute unless score @s fortune_remainder_block matches 100.. run scoreboard players remove @s fortune_block 1
execute if score @s fortune_remainder_block matches 100.. run scoreboard players operation @s fortune_remainder_block %= @s dummy

execute store result score @s fortune_dwarven_metal run attribute @s minecraft:fortune_dwarven_metal get
execute store result score @s fortune_remainder_dwarven_metal run attribute @s minecraft:fortune_dwarven_metal get 100
scoreboard players operation @s fortune_remainder_dwarven_metal %= @s dummy
scoreboard players operation @s fortune_dwarven_metal += @s fortune_mining
scoreboard players operation @s fortune_remainder_dwarven_metal += @s fortune_remainder_mining
execute unless score @s fortune_remainder_dwarven_metal matches 100.. run scoreboard players remove @s fortune_dwarven_metal 1
execute if score @s fortune_remainder_dwarven_metal matches 100.. run scoreboard players operation @s fortune_remainder_dwarven_metal %= @s dummy

execute store result score @s fortune_titanium run attribute @s minecraft:fortune_titanium get
execute store result score @s fortune_remainder_titanium run attribute @s minecraft:fortune_titanium get 100
scoreboard players operation @s fortune_remainder_titanium %= @s dummy
scoreboard players operation @s fortune_titanium += @s fortune_dwarven_metal
scoreboard players operation @s fortune_remainder_titanium += @s fortune_remainder_dwarven_metal
execute unless score @s fortune_remainder_titanium matches 100.. run scoreboard players remove @s fortune_titanium 1
execute if score @s fortune_remainder_titanium matches 100.. run scoreboard players operation @s fortune_remainder_titanium %= @s dummy

execute store result score @s fortune_gemstone run attribute @s minecraft:fortune_gemstone get
execute store result score @s fortune_remainder_gemstone run attribute @s minecraft:fortune_gemstone get 100
scoreboard players operation @s fortune_remainder_gemstone %= @s dummy

execute store result score @s pristine run attribute @s minecraft:pristine get 100


execute store result score @s fortune_farming run attribute @s minecraft:fortune_farming get
execute store result score @s fortune_remainder_farming run attribute @s minecraft:fortune_farming get 100
scoreboard players operation @s fortune_remainder_farming %= @s dummy

execute store result score @s fortune_wheat run attribute @s minecraft:fortune_wheat get
execute store result score @s fortune_remainder_wheat run attribute @s minecraft:fortune_wheat get 100
scoreboard players operation @s fortune_remainder_wheat %= @s dummy
scoreboard players operation @s fortune_wheat += @s fortune_farming
scoreboard players operation @s fortune_remainder_wheat += @s fortune_remainder_farming
execute unless score @s fortune_remainder_wheat matches 100.. run scoreboard players remove @s fortune_wheat 1
execute if score @s fortune_remainder_wheat matches 100.. run scoreboard players operation @s fortune_remainder_wheat %= @s dummy

execute store result score @s fortune_potato run attribute @s minecraft:fortune_potato get
execute store result score @s fortune_remainder_potato run attribute @s minecraft:fortune_potato get 100
scoreboard players operation @s fortune_remainder_potato %= @s dummy
scoreboard players operation @s fortune_potato += @s fortune_farming
scoreboard players operation @s fortune_remainder_potato += @s fortune_remainder_farming
execute unless score @s fortune_remainder_potato matches 100.. run scoreboard players remove @s fortune_potato 1
execute if score @s fortune_remainder_potato matches 100.. run scoreboard players operation @s fortune_remainder_potato %= @s dummy

execute store result score @s fortune_carrot run attribute @s minecraft:fortune_carrot get
execute store result score @s fortune_remainder_carrot run attribute @s minecraft:fortune_carrot get 100
scoreboard players operation @s fortune_remainder_carrot %= @s dummy
scoreboard players operation @s fortune_carrot += @s fortune_farming
scoreboard players operation @s fortune_remainder_carrot += @s fortune_remainder_farming
execute unless score @s fortune_remainder_carrot matches 100.. run scoreboard players remove @s fortune_carrot 1
execute if score @s fortune_remainder_carrot matches 100.. run scoreboard players operation @s fortune_remainder_carrot %= @s dummy

execute store result score @s fortune_pumpkin run attribute @s minecraft:fortune_pumpkin get
execute store result score @s fortune_remainder_pumpkin run attribute @s minecraft:fortune_pumpkin get 100
scoreboard players operation @s fortune_remainder_pumpkin %= @s dummy
scoreboard players operation @s fortune_pumpkin += @s fortune_farming
scoreboard players operation @s fortune_remainder_pumpkin += @s fortune_remainder_farming
execute unless score @s fortune_remainder_pumpkin matches 100.. run scoreboard players remove @s fortune_pumpkin 1
execute if score @s fortune_remainder_pumpkin matches 100.. run scoreboard players operation @s fortune_remainder_pumpkin %= @s dummy

execute store result score @s fortune_melon run attribute @s minecraft:fortune_melon get
execute store result score @s fortune_remainder_melon run attribute @s minecraft:fortune_melon get 100
scoreboard players operation @s fortune_remainder_melon %= @s dummy
scoreboard players operation @s fortune_melon += @s fortune_farming
scoreboard players operation @s fortune_remainder_melon += @s fortune_remainder_farming
execute unless score @s fortune_remainder_melon matches 100.. run scoreboard players remove @s fortune_melon 1
execute if score @s fortune_remainder_melon matches 100.. run scoreboard players operation @s fortune_remainder_melon %= @s dummy

execute store result score @s fortune_cactus run attribute @s minecraft:fortune_cactus get
execute store result score @s fortune_remainder_cactus run attribute @s minecraft:fortune_cactus get 100
scoreboard players operation @s fortune_remainder_cactus %= @s dummy
scoreboard players operation @s fortune_cactus += @s fortune_farming
scoreboard players operation @s fortune_remainder_cactus += @s fortune_remainder_farming
execute unless score @s fortune_remainder_cactus matches 100.. run scoreboard players remove @s fortune_cactus 1
execute if score @s fortune_remainder_cactus matches 100.. run scoreboard players operation @s fortune_remainder_cactus %= @s dummy

execute store result score @s fortune_nether_wart run attribute @s minecraft:fortune_nether_wart get
execute store result score @s fortune_remainder_nether_wart run attribute @s minecraft:fortune_nether_wart get 100
scoreboard players operation @s fortune_remainder_nether_wart %= @s dummy
scoreboard players operation @s fortune_nether_wart += @s fortune_farming
scoreboard players operation @s fortune_remainder_nether_wart += @s fortune_remainder_farming
execute unless score @s fortune_remainder_nether_wart matches 100.. run scoreboard players remove @s fortune_nether_wart 1
execute if score @s fortune_remainder_nether_wart matches 100.. run scoreboard players operation @s fortune_remainder_nether_wart %= @s dummy

execute store result score @s fortune_cocoa_beans run attribute @s minecraft:fortune_cocoa_beans get
execute store result score @s fortune_remainder_cocoa_beans run attribute @s minecraft:fortune_cocoa_beans get 100
scoreboard players operation @s fortune_remainder_cocoa_beans %= @s dummy
scoreboard players operation @s fortune_cocoa_beans += @s fortune_farming
scoreboard players operation @s fortune_remainder_cocoa_beans += @s fortune_remainder_farming
execute unless score @s fortune_remainder_cocoa_beans matches 100.. run scoreboard players remove @s fortune_cocoa_beans 1
execute if score @s fortune_remainder_cocoa_beans matches 100.. run scoreboard players operation @s fortune_remainder_cocoa_beans %= @s dummy

execute store result score @s fortune_mushroom run attribute @s minecraft:fortune_mushroom get
execute store result score @s fortune_remainder_mushroom run attribute @s minecraft:fortune_mushroom get 100
scoreboard players operation @s fortune_remainder_mushroom %= @s dummy
scoreboard players operation @s fortune_mushroom += @s fortune_farming
scoreboard players operation @s fortune_remainder_mushroom += @s fortune_remainder_farming
execute unless score @s fortune_remainder_mushroom matches 100.. run scoreboard players remove @s fortune_mushroom 1
execute if score @s fortune_remainder_mushroom matches 100.. run scoreboard players operation @s fortune_remainder_mushroom %= @s dummy

execute store result score @s fortune_sugar_cane run attribute @s minecraft:fortune_sugar_cane get
execute store result score @s fortune_remainder_sugar_cane run attribute @s minecraft:fortune_sugar_cane get 100
scoreboard players operation @s fortune_remainder_sugar_cane %= @s dummy
scoreboard players operation @s fortune_sugar_cane += @s fortune_farming
scoreboard players operation @s fortune_remainder_sugar_cane += @s fortune_remainder_farming
execute unless score @s fortune_remainder_sugar_cane matches 100.. run scoreboard players remove @s fortune_sugar_cane 1
execute if score @s fortune_remainder_sugar_cane matches 100.. run scoreboard players operation @s fortune_remainder_sugar_cane %= @s dummy


execute store result score @s fortune_foraging run attribute @s minecraft:fortune_foraging get
execute store result score @s fortune_remainder_foraging run attribute @s minecraft:fortune_foraging get 100
scoreboard players operation @s fortune_remainder_foraging %= @s dummy

