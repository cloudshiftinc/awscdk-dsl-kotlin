@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.location.CfnMap

/**
 * Specifies the map tile style selected from an available provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.location.*;
 * MapConfigurationProperty mapConfigurationProperty = MapConfigurationProperty.builder()
 * .style("style")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-location-map-mapconfiguration.html)
 */
@CdkDslMarker
public class CfnMapMapConfigurationPropertyDsl {
  private val cdkBuilder: CfnMap.MapConfigurationProperty.Builder =
      CfnMap.MapConfigurationProperty.builder()

  /**
   * @param style Specifies the map style selected from an available data provider. 
   * Valid [Esri map styles](https://docs.aws.amazon.com/location/latest/developerguide/esri.html) :
   *
   * * `VectorEsriDarkGrayCanvas` – The Esri Dark Gray Canvas map style. A vector basemap with a
   * dark gray, neutral background with minimal colors, labels, and features that's designed to draw
   * attention to your thematic content.
   * * `RasterEsriImagery` – The Esri Imagery map style. A raster basemap that provides one meter or
   * better satellite and aerial imagery in many parts of the world and lower resolution satellite
   * imagery worldwide.
   * * `VectorEsriLightGrayCanvas` – The Esri Light Gray Canvas map style, which provides a detailed
   * vector basemap with a light gray, neutral background style with minimal colors, labels, and
   * features that's designed to draw attention to your thematic content.
   * * `VectorEsriTopographic` – The Esri Light map style, which provides a detailed vector basemap
   * with a classic Esri map style.
   * * `VectorEsriStreets` – The Esri Street Map style, which provides a detailed vector basemap for
   * the world symbolized with a classic Esri street map style. The vector tile layer is similar in
   * content and style to the World Street Map raster map.
   * * `VectorEsriNavigation` – The Esri Navigation map style, which provides a detailed basemap for
   * the world symbolized with a custom navigation map style that's designed for use during the day in
   * mobile devices.
   *
   * Valid [HERE Technologies map
   * styles](https://docs.aws.amazon.com/location/latest/developerguide/HERE.html) :
   *
   * * `VectorHereContrast` – The HERE Contrast (Berlin) map style is a high contrast detailed base
   * map of the world that blends 3D and 2D rendering.
   *
   *
   * The `VectorHereContrast` style has been renamed from `VectorHereBerlin` . `VectorHereBerlin`
   * has been deprecated, but will continue to work in applications that use it.
   *
   *
   * * `VectorHereExplore` – A default HERE map style containing a neutral, global map and its
   * features including roads, buildings, landmarks, and water features. It also now includes a fully
   * designed map of Japan.
   * * `VectorHereExploreTruck` – A global map containing truck restrictions and attributes (e.g.
   * width / height / HAZMAT) symbolized with highlighted segments and icons on top of HERE Explore to
   * support use cases within transport and logistics.
   * * `RasterHereExploreSatellite` – A global map containing high resolution satellite imagery.
   * * `HybridHereExploreSatellite` – A global map displaying the road network, street names, and
   * city labels over satellite imagery. This style will automatically retrieve both raster and vector
   * tiles, and your charges will be based on total tiles retrieved.
   *
   *
   * Hybrid styles use both vector and raster tiles when rendering the map that you see. This means
   * that more tiles are retrieved than when using either vector or raster tiles alone. Your charges
   * will include all tiles retrieved.
   *
   *
   * Valid [GrabMaps map
   * styles](https://docs.aws.amazon.com/location/latest/developerguide/grab.html) :
   *
   * * `VectorGrabStandardLight` – The Grab Standard Light map style provides a basemap with
   * detailed land use coloring, area names, roads, landmarks, and points of interest covering
   * Southeast Asia.
   * * `VectorGrabStandardDark` – The Grab Standard Dark map style provides a dark variation of the
   * standard basemap covering Southeast Asia.
   *
   *
   * Grab provides maps only for countries in Southeast Asia, and is only available in the Asia
   * Pacific (Singapore) Region ( `ap-southeast-1` ). For more information, see [GrabMaps countries and
   * area
   * covered](https://docs.aws.amazon.com/location/latest/developerguide/grab.html#grab-coverage-area)
   * .
   *
   *
   * Valid [Open Data map
   * styles](https://docs.aws.amazon.com/location/latest/developerguide/open-data.html) :
   *
   * * `VectorOpenDataStandardLight` – The Open Data Standard Light map style provides a detailed
   * basemap for the world suitable for website and mobile application use. The map includes highways
   * major roads, minor roads, railways, water features, cities, parks, landmarks, building footprints,
   * and administrative boundaries.
   * * `VectorOpenDataStandardDark` – Open Data Standard Dark is a dark-themed map style that
   * provides a detailed basemap for the world suitable for website and mobile application use. The map
   * includes highways major roads, minor roads, railways, water features, cities, parks, landmarks,
   * building footprints, and administrative boundaries.
   * * `VectorOpenDataVisualizationLight` – The Open Data Visualization Light map style is a
   * light-themed style with muted colors and fewer features that aids in understanding overlaid data.
   * * `VectorOpenDataVisualizationDark` – The Open Data Visualization Dark map style is a
   * dark-themed style with muted colors and fewer features that aids in understanding overlaid data.
   */
  public fun style(style: String) {
    cdkBuilder.style(style)
  }

  public fun build(): CfnMap.MapConfigurationProperty = cdkBuilder.build()
}
