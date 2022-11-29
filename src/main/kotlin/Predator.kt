//номер, название, вес, кошачье
class Predator(id: Int, name: String, weight: String, val feline: String) : Animal(id, name, weight)
{
    override fun toString()="$name(id=$id,name=$name,weight=$weight,$feline)"
}