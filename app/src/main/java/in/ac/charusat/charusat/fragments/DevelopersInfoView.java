package in.ac.charusat.charusat.fragments;

import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.expand.Parent;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;
import com.mindorks.placeholderview.annotations.expand.SingleTop;

import in.ac.charusat.charusat.R;

@Parent
@SingleTop
@Layout(R.layout.developers_info_feed_item)
class DevelopersInfoView {

    @ParentPosition
    int mParentPosition;

    @Resolve
    void onResolved() {
        //Leave intentionally

        //TODO : Add images of developers
    }

}
