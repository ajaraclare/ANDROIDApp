package net.simplifiedcoding

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import net.simplifiedcoding.fragments.CompleteRoutineFragment
import net.simplifiedcoding.fragments.EveningRoutineFragment
import net.simplifiedcoding.fragments.HobbiesRoutineFragment
import net.simplifiedcoding.fragments.HomeFragment
import net.simplifiedcoding.fragments.MorningRoutineFragment
import net.simplifiedcoding.fragments.StudyRoutineFragment
import net.simplifiedcoding.fragments.WorkRoutineFragment
import net.simplifiedcoding.navigation.AppNavHost
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.theme.AppTheme



@AndroidEntryPoint
class MainActivity : AppCompatActivity() {



    private val viewModel by viewModels<AuthViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContent {
            AppTheme {
                AppNavHost(viewModel)
            }
        }

        val homeFragment = HomeFragment()
        val morningRoutineFragment = MorningRoutineFragment()
        val eveningRoutineFragment= EveningRoutineFragment()
        val studyRoutineFragment= StudyRoutineFragment()
        val workRoutineFragment= WorkRoutineFragment()
        val hobbiesRoutineFragment= HobbiesRoutineFragment()

        makeCurrentFragment(homeFragment)

        bottom_navigation.setOnNavigationItemSelectedListener{
                when (it.itemId){
                    R.id.R_home_png -> makeCurrentFragment(homeFragment)
                    R.id.R_morning_png -> makeCurrentFragment(morningRoutineFragment)
                    R.id.R_evening_png -> makeCurrentFragment(eveningRoutineFragment)
                    R.id.R_studytime_png -> makeCurrentFragment(studyRoutineFragment)
                    R.id.R_worktime_png -> makeCurrentFragment(workRoutineFragment)
                    R.id.R_hobby_png -> makeCurrentFragment(hobbiesRoutineFragment)
                    R.id.R_routine_png -> makeCurrentFragment(completeRoutineFragment)


                }
                true

            }









        }

    private fun makeCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.fl_wrapper, fragment)
            commit()
        }


            }











