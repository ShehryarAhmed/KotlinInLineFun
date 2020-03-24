package com.dotinfiny.mvvmexample.genericsBuilding

import com.dotinfiny.mvvmexample.generics.WaterSupply
import java.sql.BatchUpdateException

open class BaseBuildingMaterial(open val numberNeeded: Int = 1) {}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}


class Building<T : BaseBuildingMaterial>(val buildingMaterial: T) {
    val baseMaterialNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialNeeded

    fun build() {
        println(" ${actualMaterialsNeeded} ${buildingMaterial::class.simpleName} required")
    }
}


interface Cleaners<in T : WaterSupply> {
    fun clean(waterSupply: T)
}


fun main() {
    Building(Wood()).build()
    Building(Brick()).build()
    isSmallBuilding(Building(Wood()))

}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}

fun <T : BaseBuildingMaterial> isSmallBuilding2(building: Building<T>) {

}
