package com.blinkymap.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import com.blinkymap.stormy.R;

/**
 * Created by markw on 10/1/2017.
 */

public class AlertDialogFrragment extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(R.string.error_title)
                .setMessage(R.string.error_message)
                .setPositiveButton(R.string.error_ok_text, null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
