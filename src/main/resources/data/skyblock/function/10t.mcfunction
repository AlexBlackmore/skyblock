execute as @a run function skyblock:attributes
execute as @e[type=#skyblock:custom_name_visible] unless data entity @s CustomNameVisible run data modify entity @s CustomNameVisible set value true

execute as @e[type=#skyblock:hostile,tag=!RUNIC,tag=!NOT_RUNIC] if predicate skyblock:is_runic run tag @s add IS_RUNIC
effect give @e[tag=IS_RUNIC] skyblock:runic infinite
execute as @e[tag=IS_RUNIC] run data modify entity @s Health set value 1024
tag @e[tag=IS_RUNIC] add RUNIC
tag @e[tag=IS_RUNIC] remove IS_RUNIC
execute as @e[type=#skyblock:hostile,tag=!RUNIC,tag=!NOT_RUNIC] run tag @s add NOT_RUNIC