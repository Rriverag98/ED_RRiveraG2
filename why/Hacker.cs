using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Hacker : MonoBehaviour {
    const string menuHint = "You can tyoe menu at any time.";
    #region Class Attributes
    //Class Attributes
    //These arrays will hold the passwords for each level
    string[] passwordLevel1 = { "book", "class", "teacher", "room", "hour" };
    string[] passwordLevel2 = { "cashier", "department", "payment", "electronics" };
    string[] passwordLevel3 = { "dossier", "international", "security" };
    //enumerated tipe to represent the different states, variable is declared to hold the 
    //current game state
    string input;
    int level;
    enum GameState { MainMenu, Password, Win };
    GameState currentScreen = GameState.MainMenu;
    string password;

    //This variable will receive the users input
    #endregion
    // Use this for initialization
    void Start () { 
        showMainMenu();
    }

    private void onUserInput(string input)
    {
        //if user inputs menu then main menu is shown
        if (input == "menu") {
            showMainMenu();
        } else if (input == "quit" || input == "close") { // if user inputs quit or closed 
            Terminal.WriteLine("Please close the browser´s tab"); //the game will end
            Application.Quit();
        }
        //if the user inputs something different to menu,quit or close, the input will be
        //handled depending the gamestate
        if (currentScreen == GameState.MainMenu)
        {
            runMainMenu(input);
        }
        //if GameState is password, then we must call checkPassword()
        else if (currentScreen == GameState.Password)
        {
            CheckPassword(input);
        } 
    }

    private void CheckPassword(string input)
    {
        if (input == password)
        {
            displayWinScreen();
        } else
        {
            askForPassword();
        }
    }

    private void displayWinScreen()
    {
        Terminal.ClearScreen();
        showLevelReward();
        Terminal.WriteLine(menuHint);
    }

    private void showLevelReward()
    {
        switch (level)
        {
            case 1:
                Terminal.WriteLine("Grab a free book!");
                Terminal.WriteLine(@"
"

                    );
                break;

        }
    }

    private void runMainMenu(string input)
    {   //Validate that input is valid
        bool isValidInput = (input == "1") || (input == "2") || (input == "3");
        //If it is then we convert the input into an int and assign it to level
        //and call askForPassword();
        if (isValidInput)
        {
            level = int.Parse(input);
            askForPassword();
        } else if (input == "007") //if the input is invalid, check if its an easter egg
        {
            Terminal.WriteLine("Please enter a valid level, Mr.Bond");
        } else
        {
            Terminal.WriteLine("Please enter a valid level");
        }
        
    }

    private void askForPassword()
    {   //set currentScreen as GameState password
        currentScreen = GameState.Password;
        //Clear Screen
        Terminal.ClearScreen();
        //Call setRandomPassord to set a password
        setRandomPassword();
        Terminal.WriteLine("Enter your password. Hint:" + password.Anagram());
        //show menuHint
        Terminal.WriteLine(menuHint);
    }

    private void setRandomPassword()
    {
        switch (level)
        {
            case 1:
                password = passwordLevel1[UnityEngine.Random.Range(0,passwordLevel1.Length)];
                break;
            case 2:
                password = passwordLevel2[UnityEngine.Random.Range(0, passwordLevel2.Length)];
                break;
            case 3:
                password = passwordLevel3[UnityEngine.Random.Range(0, passwordLevel3.Length)];
                break;
            default:
                Debug.LogError("Invalid level");
                break;
        }
    }

    private void showMainMenu()
    {
        Terminal.ClearScreen();
        Terminal.WriteLine("What will you hack today?");
        Terminal.WriteLine("");
        Terminal.WriteLine("1. Town´s College");
        Terminal.WriteLine("2. City´s Super Center");
        Terminal.WriteLine("3. NSA Server");
        Terminal.WriteLine("");
        Terminal.WriteLine("Option?");
        currentScreen = GameState.MainMenu;
    }


    // Update is called once per frame
    void Update () {
		
	}
}
