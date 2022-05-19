
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.backgroundapp.BGItem
import com.example.backgroundapp.R
import com.squareup.picasso.Picasso

class CustomAdapter(private val mList: List<BGItem>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view 
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.bg_item_layout, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class

        //holder.imageView.setImageResource(ItemsViewModel.image)
        Picasso.get().load(com.google.android.material.R.drawable.ic_clock_black_24dp).into(holder.imageView);
        //Picasso.get().load("https://square.github.io/picasso/static/sample.png").placeholder(R.drawable.ic_launcher_background).into(holder.imageView)
        // sets the text to the textview from our itemHolder class


    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)

    }
}