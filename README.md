# ObeliskMod

## Getting Started (With IntelliJ)

First off, you'll want to clone the project using the application of your choice (recommended: GitKraken). Next, install IntelliJ community edition from their website: https://www.jetbrains.com/idea/download/

Once you open IntelliJ you should see the following screen, though yours will not list any projects in the left-hand panel. From this screen, select the option to import a project from the main window.

![Importing the project](readmeimgs/IntelliJ.png "Importing the project")

You should then be prompted to select a file or directory to import. Navigate to the directory that you cloned the project to, until you locate the build.gradle file. Select this file and then click 'OK' to continue.

![Selecting the directory](readmeimgs/SelectImport.png "Selecting the build.gradle file to import")

After you've selected the gradle build file, you should be met with an empty window that looks something like the following screen. In the version control pane, you will see something along the lines of importing project settings, along with a status bar at the very bottom of the screen. While you should be able to work within the IntelliJ environment, it is advisable to wait until the operations are finished, as IntelliJ is performing the workspace setup, and it may cause problems in the future if you open any files before the operation is complete. You should be able to tell when it is complete, as you will see a refresh button instead of a stop button.

![First time import](readmeimgs/GradlewBuild.png "Importing the project for the first time")

After everything has finished, you can hide the panel by clicking the minus icon in the top right corner. Open the panel at any time by clicking the "Version Control" button at the bottom of the window.

![Hide/Show version control](readmeimgs/HideShowVCS.png "Hiding or viewing the version control panel")

While you're currently set up to work in Java, there are a few plugins that can make things a lot easier, but one in particular that *should* be installed. In order to install plugins navigate to the application settings **File->Settings** or **Ctrl+Alt+S** and select **Plugins** from the catecories on the left

![Application Settings](readmeimgs/PluginsStep1.png)

You should now see the plugins marketplace. Type "Minecraft" into the search bar, and install the plugin named "Minecraft Development", which adds support for Forge development within the IntelliJ environment, including IntelliSense, auto-correction, and other useful features. Other plugins which are useful, but not crucial are Rainbow Brackets and a JSON parser of your choice. You can also browse for themes if you wish to change the look of your workspace environment.

![Plugins](readmeimgs/PluginsStep2.png "Installing plugins from the marketplace")

Now, you should be all set up to work on the mod. If you wish to test what you have, the build environment has already set up the compillation tasks for you. Simply click the "Gradle" panel on the right hand side, then navigate to the **runClient** task **Tasks->fg_runs** and double click ***runClient***. An output console should appear down the bottom of your screen which will show any errors during compillation, and also the output log while the Minecraft client is running so that you can check any debug messages that are logged to console.

![Gradle Run Client](readmeimgs/TestingCode.png)