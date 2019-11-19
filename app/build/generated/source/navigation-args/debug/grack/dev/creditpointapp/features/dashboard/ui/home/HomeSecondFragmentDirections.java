package grack.dev.creditpointapp.features.dashboard.ui.home;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import grack.dev.creditpointapp.R;

public class HomeSecondFragmentDirections {
  private HomeSecondFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeSecondFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_HomeSecondFragment_to_HomeFragment);
  }
}
