package com.ebookfrenzy.coffepicker45;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by sergio on 12/5/2016.
 */

public class MyDialogFragment extends DialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());
        theDialog.setTitle("Quick Question!");
        theDialog.setMessage("You Want Some Coffee?");
        theDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                Toast.makeText(getActivity(),"You do want some Coffee", Toast.LENGTH_SHORT).show();

            }
        });
        theDialog.setNegativeButton("Heck No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                Toast.makeText(getActivity(),"I see you like water.", Toast.LENGTH_SHORT).show();

            }
        });
        return theDialog.create();
        //return super.onCreateDialog(savedInstanceState);
    }
}
