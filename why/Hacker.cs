using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Hacker : MonoBehaviour {
    const string menuHint = "You can tyoe menu at any time.";
    #region Class Attributes
    string[] passwordLevel1 = { "book", "class", "teacher", "room", "hour" };
    string[] passwordLevel2 = { "cashier", "department", "payment", "electronics" };
    string[] passwordLevel3 = { "dossier", "international", "security" };
    string input;
    int level;
    enum GameState { MainMenu, Password, Win };
    GameState currentScreen = GameState.MainMenu;
    string password;
    #endregion
    void Start () { 
        showMainMenu();
    }

    private void onUserInput(string input)
    {
        if (input == "menu") {
            showMainMenu();
        } else if (input == "quit" || input == "close") { 
            Terminal.WriteLine("Please close the browser´s tab");
            Application.Quit();
        }
        
        if (currentScreen == GameState.MainMenu)
        {
            runMainMenu(input);
        }
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
        bool isValidInput = (input == "1") || (input == "2") || (input == "3");
        if (isValidInput)
        {
            level = int.Parse(input);
            askForPassword();
        } else if (input == "007") 
        {
            Terminal.WriteLine("Please enter a valid level, Mr.Bond");
        } else
        {
            Terminal.WriteLine("Please enter a valid level");
        }
        
    }

    private void askForPassword()
    { 
        currentScreen = GameState.Password;
        Terminal.ClearScreen();
        setRandomPassword();
        Terminal.WriteLine("Enter your password. Hint:" + password.Anagram());
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

    void Update () {
		
	}
}
