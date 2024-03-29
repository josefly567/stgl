﻿/*
Copyright (c) 2003-2012, CKSource - Frederico Knabben. All rights reserved.
For licensing, see LICENSE.html or http://ckeditor.com/license
*/

CKEDITOR.plugins.setLang('a11yhelp', 'el',
    {
        accessibilityHelp:
            {
                title: 'Οδηγίες Προσβασιμότητας',
                contents: 'Περιεχόμενα Βοήθειας. Πατήστε ESC για κλείσιμο.',
                legend:
                    [
                        {
                            name: 'Γενικά',
                            items:
                                [
                                    {
                                        name: 'Εργαλειοθήκη Επεξεργαστή',
                                        legend:
                                            'Πατήστε ${toolbarFocus} για να περιηγηθείτε στην γραμμή εργαλείων. Μετακινηθείτε ανάμεσα στις ομάδες της γραμμής εργαλείων με TAB και Shift-TAB. Μετακινηθείτε ανάμεσα στα κουμπία εργαλείων με ΔΕΞΙ και ΑΡΙΣΤΕΡΟ ΒΕΛΑΚΙ. Πατήστε ΚΕΝΟ ή ENTER για να ενεργοποιήσετε το ενεργό κουμπί εργαλείου.'
                                    },

                                    {
                                        name: 'Παράθυρο Διαλόγου Επεξεργαστή',
                                        legend:
                                            'Μέσα σε ένα παράθυρο διαλόγου, πατήστε TAB για να μεταβείτε στο επόμενο πεδίο ή SHIFT + TAB για να μεταβείτε στο προηγούμενο. Πατήστε ENTER για να υποβάλετε την φόρμα. Πατήστε ESC για να ακυρώσετε την διαδικασία της φόρμας. Για παράθυρα διαλόγων που έχουν πολλές σελίδες σε καρτέλες πατήστε ALT + F10 για να μεταβείτε στην λίστα των καρτέλων. Στην συνέχεια μπορείτε να μεταβείτε στην επόμενη καρτέλα πατώντας TAB ή RIGHT ARROW. Μπορείτε να μεταβείτε στην προηγούμενη καρτέλα πατώντας SHIFT + TAB ή LEFT ARROW. Πατήστε SPACE ή ENTER για να επιλέξετε την καρτέλα για προβολή.'
                                    },

                                    {
                                        name: 'Αναδυόμενο Μενού Επεξεργαστή',
                                        legend:
                                            'Press ${contextMenu} or APPLICATION KEY to open context-menu. Then move to next menu option with TAB or DOWN ARROW. Move to previous option with SHIFT+TAB or UP ARROW. Press SPACE or ENTER to select the menu option. Open sub-menu of current option with SPACE or ENTER or RIGHT ARROW. Go back to parent menu item with ESC or LEFT ARROW. Close context menu with ESC.'  // MISSING
                                    },

                                    {
                                        name: 'Editor List Box', // MISSING
                                        legend:
                                            'Inside a list-box, move to next list item with TAB OR DOWN ARROW. Move to previous list item with SHIFT + TAB or UP ARROW. Press SPACE or ENTER to select the list option. Press ESC to close the list-box.'  // MISSING
                                    },

                                    {
                                        name: 'Editor Element Path Bar', // MISSING
                                        legend:
                                            'Press ${elementsPathFocus} to navigate to the elements path bar. Move to next element button with TAB or RIGHT ARROW. Move to previous button with  SHIFT+TAB or LEFT ARROW. Press SPACE or ENTER to select the element in editor.'  // MISSING
                                    }
                                ]
                        },
                        {
                            name: 'Εντολές',
                            items:
                                [
                                    {
                                        name: ' Εντολή αναίρεσης',
                                        legend: 'Πατήστε ${undo}'
                                    },
                                    {
                                        name: ' Εντολή επανάληψης',
                                        legend: 'Πατήστε ${redo}'
                                    },
                                    {
                                        name: ' Εντολή έντονης γραφής',
                                        legend: 'Πατήστε ${bold}'
                                    },
                                    {
                                        name: ' Εντολή πλάγιας γραφής',
                                        legend: 'Πατήστε ${italic}'
                                    },
                                    {
                                        name: ' Εντολή υπογράμμισης',
                                        legend: 'Πατήστε ${underline}'
                                    },
                                    {
                                        name: ' Εντολή συνδέσμου',
                                        legend: 'Πατήστε ${link}'
                                    },
                                    {
                                        name: ' Εντολή Σύμπτηξης Εργαλειοθήκης',
                                        legend: 'Πατήστε ${toolbarCollapse}'
                                    },
                                    {
                                        name: ' Βοήθεια Προσβασιμότητας',
                                        legend: 'Πατήστε ${a11yHelp}'
                                    }
                                ]
                        }
                    ]
            }
    });
