package com.dotinfiny.mvvmexample.generics

class MyList<T>{
    fun get(pos:Int) : Int {return 0}
    fun addItem(item : Int) {}
}


fun workWithMyList(){
    val intList : MyList<Int>
    val stringList : MyList<String>
}

open class WaterSupply(var needsProcess: Boolean)

class TapWater : WaterSupply(true){
    fun addChemicalCleaners(){
        needsProcess = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true){
    fun filter(){
        needsProcess = false
    }
}

class Aquarium<T:WaterSupply>(val waterSupply:T){
    fun addWater(){
        check(false){ "water supply needs processed" }

        println("adding water from ${waterSupply.needsProcess}")
    }
}

fun genericsExample(){
    val aquarium = Aquarium(TapWater())
    println(aquarium.waterSupply.needsProcess)
    aquarium.waterSupply.addChemicalCleaners()

    val aquarium1 = Aquarium(LakeWater())
    aquarium1.waterSupply.filter()
    aquarium1.addWater()
}

fun main(){
    genericsExample()
}