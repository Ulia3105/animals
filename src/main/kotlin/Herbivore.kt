//номер, название, вес, c копытами
class Herbivore(id: Int, name: String, weight: String, val hoofed: String) : Animal(id, name,weight)
{
    override fun toString()="$name(id=$id,name=$name,weight=$weight,$hoofed)"
}