# DisablePluginsCommand
DisablePluginsCommand is a simple plugin for Minecraft servers based on Bukkit/Spigot/Paper, etc. It stops players from being able to run the `/plugins`, `/pl`, `/version`, `/ver`, and `/about` . If you don't want hackers and cheaters screwing around with your Minecraft server by exploiting vunerabilities in the plugins you use, then this is the plugin for you.

It is also highly customizable. You can choose what commands you want to remain enabled, let admins and devs bypass the plugin by giving them a permission node, and even change the deny message.

## Installation: For server admins

Just download the latest version of the plugin from the Spigot page and drop the .jar file into your plugins folder. It's that simple!

## Usage

DisablePluginsCommand should work out of the box, with no additional configuration needed. However, there are some options you can change if you wish.
![Demonstration of the plugin](img/demo.gif)

### Commands
 * **/disablepluginscommand reload** - reloads the `config.yml` file.
 * **/disablepluginscommand version** - Displays the version of the plugin being run on the server.
 * **/disablepluginscommand help** - Displays a simple help message.
 
 ### Permission nodes
  * `disablePluginsCmd.bypass` - Players with this permission node (set to true) will bypass all commands that this plugn disables.
  * `disablePluginsCmd.admin` - Players with this permission node (set to true) can run the `help`, `version`, and `reload` commands.
  
 ### Configuration
 config.yml:
 ```yml
# disablePluginsCommand ${project.version}
# A plugin by Nikolai Patrick (Artichoke) - 2022

#Disable the /plugins and /pl command for un-opped users or users with insufficient permissions:
disable-plugins-cmd: true

#Disable the /about command for un-opped users or users with insufficient permissions:
disable-about-cmd: true

#Disable the /version command for un-opped users or users with insufficient privileges:
disable-version-cmd: true

#NOTE, if a player is an op or has the permission node disablePluginsCmd.bypass , they will be able to run /plugin, /pl, /version, /ver or /about regardless.
```

 
