package net.simplifiedcoding.fragments

import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.simplifiedcoding.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [EveningRoutineFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EveningRoutineFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_evening_routine, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment EveningRoutineFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            EveningRoutineFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    @Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun EveningRoutineScreen (){
        Column(){
            Text(text = "Morning Routine")
        }

        var routine by remember { mutableStateOf(TextFieldValue(text = "")) }


        Card {
            Row {

                TextField(value = routine,
                    label = { Text(text = "routine") },
                    onValueChange = {
                        routine = it
                    })

                Spacer(modifier = Modifier.width(20.dp))

                val isChecked = remember { mutableStateOf(true) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        Card {
            Row {

                TextField(value = routine,
                    label = { Text(text = "routine") },
                    onValueChange = {
                        routine = it
                    })

                Spacer(modifier = Modifier.width(20.dp))

                val isChecked = remember { mutableStateOf(true) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        Card {
            Row {

                TextField(value = routine,
                    label = { Text(text = "routine") },
                    onValueChange = {
                        routine = it
                    })

                Spacer(modifier = Modifier.width(20.dp))

                val isChecked = remember { mutableStateOf(true) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        Card {
            Row {

                TextField(value = routine,
                    label = { Text(text = "routine") },
                    onValueChange = {
                        routine = it
                    })

                Spacer(modifier = Modifier.width(20.dp))

                val isChecked = remember { mutableStateOf(true) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        Card {
            Row {

                TextField(value = routine,
                    label = { Text(text = "routine") },
                    onValueChange = {
                        routine = it
                    })

                Spacer(modifier = Modifier.width(20.dp))

                val isChecked = remember { mutableStateOf(true) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Card {
            Row {

                TextField(value = routine,
                    label = { Text(text = "routine") },
                    onValueChange = {
                        routine = it
                    })

                Spacer(modifier = Modifier.width(20.dp))

                val isChecked = remember { mutableStateOf(true) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Card {
            Row {

                TextField(value = routine,
                    label = { Text(text = "routine") },
                    onValueChange = {
                        routine = it
                    })

                Spacer(modifier = Modifier.width(20.dp))

                val isChecked = remember { mutableStateOf(true) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Card {
            Row {

                TextField(value = routine,
                    label = { Text(text = "routine") },
                    onValueChange = {
                        routine = it
                    })

                Spacer(modifier = Modifier.width(20.dp))

                val isChecked = remember { mutableStateOf(true) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        Card {
            Row {

                TextField(value = routine,
                    label = { Text(text = "routine") },
                    onValueChange = {
                        routine = it
                    })

                Spacer(modifier = Modifier.width(20.dp))

                val isChecked = remember { mutableStateOf(true) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        Card {
            Row {

                TextField(value = routine,
                    label = { Text(text = "routine") },
                    onValueChange = {
                        routine = it
                    })

                Spacer(modifier = Modifier.width(20.dp))

                val isChecked = remember { mutableStateOf(true) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))


        Card {
            Row {

                TextField(value = routine,
                    label = { Text(text = "routine") },
                    onValueChange = {
                        routine = it
                    })

                Spacer(modifier = Modifier.width(20.dp))

                val isChecked = remember { mutableStateOf(true) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Card {
            Row {

                TextField(value = routine,
                    label = { Text(text = "routine") },
                    onValueChange = {
                        routine = it
                    })

                Spacer(modifier = Modifier.width(20.dp))

                val isChecked = remember { mutableStateOf(true) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
            }
        }


    }


}