# Activity_Lifecycle
Lesson on Activity Lifecycle...

Andorid Lifecycle consists of:
- onCreate(), onStart(), onResume(), onPause(), onStop(), onDestroy() process steps.

onCreate():
- when you click on the app icon to launch it, this method is called for the first time.
- It is then followed by onStart() and then onResume().

onResume():
- This is the method when executed is the one when your UI is visible to the user.


--- Flow ---
* From one activity to another activity (without finish()) -> onResume() - onPause() -> onStop().
Back: onRestart() -> onStart() -> onResume()...

* From one activity to another activity (finish() called i.e. First activity is completed) 
-> onResume() - onPause() - onStop() -> onDestroy() ... 
reopen (from background or icon click)
-> onCreate() ---and so on...

* From one activity to another activity (clicking on Home button of device) -> onResume() - onPause() -> onStop().
-- from Background to reopen app again 
-> onResume() - onPause() -> onStop() -> onRestart() -> onStart() -> onResume().

* (Dialog box is shown in the foreground of present activity excluding AlertDialog & DialogFragment)
-> onResume() - onPause() -> onResume()...





