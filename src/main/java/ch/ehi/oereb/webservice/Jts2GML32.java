package ch.ehi.oereb.webservice;

import java.util.UUID;

//import ch.ehi.oereb.schemas.gml._3_2.*;

public class Jts2GML32 {
//    public MultiSurfacePropertyTypeType convertMultiSurface(com.vividsolutions.jts.geom.Geometry geometry) {
//        if(geometry instanceof com.vividsolutions.jts.geom.Polygon) {
//            SurfacePropertyTypeType surfaceProperty=new SurfacePropertyTypeType();
//            surfaceProperty.setAbstractSurface(convertPolygon((com.vividsolutions.jts.geom.Polygon)geometry));
//            SurfaceMember surfaceMember=new SurfaceMember();
//            surfaceMember.setValue(surfaceProperty);
//            MultiSurfaceTypeType multiSurface=new MultiSurfaceTypeType();
//            multiSurface.setId(createId());
//            multiSurface.getSurfaceMember().add(surfaceMember);
//            MultiSurfacePropertyTypeType ret=new MultiSurfacePropertyTypeType();
//            ret.setMultiSurface(new MultiSurface(multiSurface));
//            return ret;
//        }else if(geometry instanceof com.vividsolutions.jts.geom.MultiPolygon) {
//            MultiSurfaceTypeType multiSurface=new MultiSurfaceTypeType();
//            multiSurface.setId(createId());
//            com.vividsolutions.jts.geom.MultiPolygon jtsMulti=(com.vividsolutions.jts.geom.MultiPolygon)geometry;
//            for(int i=0;i<jtsMulti.getNumGeometries();i++) {
//                com.vividsolutions.jts.geom.Polygon jtsPoly=(com.vividsolutions.jts.geom.Polygon)jtsMulti.getGeometryN(i);
//                SurfacePropertyTypeType surfaceProperty=new SurfacePropertyTypeType();
//                surfaceProperty.setAbstractSurface(convertPolygon(jtsPoly));
//                SurfaceMember surfaceMember=new SurfaceMember();
//                surfaceMember.setValue(surfaceProperty);
//                multiSurface.getSurfaceMember().add(surfaceMember);
//            }
//            MultiSurfacePropertyTypeType ret=new MultiSurfacePropertyTypeType();
//            ret.setMultiSurface(new MultiSurface(multiSurface));
//            return ret;
//        }
//        throw new IllegalArgumentException("unexpected geometry type");
//    }
//    public SurfacePropertyTypeType convertSurface(com.vividsolutions.jts.geom.Geometry geometry) {
//        if(geometry instanceof com.vividsolutions.jts.geom.Polygon) {
//            SurfacePropertyTypeType surfaceProperty=new SurfacePropertyTypeType();
//            surfaceProperty.setAbstractSurface(convertPolygon((com.vividsolutions.jts.geom.Polygon)geometry));
//            return surfaceProperty;
//        }
//        throw new IllegalArgumentException("unexpected geometry type");
//    }
//    public Polygon convertPolygon(com.vividsolutions.jts.geom.Polygon geometry) {
//        
//        com.vividsolutions.jts.geom.LineString jtsLineString=geometry.getExteriorRing();
//        LinearRing ring = createLinearRing(jtsLineString);
//        AbstractRingPropertyTypeType ringProperty = new AbstractRingPropertyTypeType();
//        ringProperty.setAbstractRing(ring);
//        
//        PolygonTypeType polygon=new PolygonTypeType();
//        polygon.setId(createId());
//        polygon.setExterior(new Exterior(ringProperty));
//        
//        int ringc=geometry.getNumInteriorRing();
//        for(int ringi=0;ringi<ringc;ringi++) {
//            jtsLineString=geometry.getInteriorRingN(ringi);
//            ring = createLinearRing(jtsLineString);
//            ringProperty = new AbstractRingPropertyTypeType();
//            ringProperty.setAbstractRing(ring);
//            polygon.getInterior().add(new Interior(ringProperty));
//        }
//        return new Polygon(polygon);
//    }
//    public CurvePropertyTypeType convertCurve(com.vividsolutions.jts.geom.LineString jtsLine) {
//        CurvePropertyTypeType curveProperty = new CurvePropertyTypeType();
//        curveProperty.setAbstractCurve(createLineString(jtsLine));
//        return curveProperty;
//    }
//    
//    public LineString createLineString(com.vividsolutions.jts.geom.LineString jtsLineString) {
//        LineStringTypeType line=new LineStringTypeType();
//        line.setId(createId());
//        for(com.vividsolutions.jts.geom.Coordinate jtsCoord:jtsLineString.getCoordinates()) {
//            Pos pos = createPos(jtsCoord);
//            line.getPosOrPointPropertyOrPointRep().add(pos);
//        }
//        return new LineString(line);
//    }
//    public LinearRing createLinearRing(com.vividsolutions.jts.geom.LineString jtsLineString) {
//        LinearRingTypeType ring=new LinearRingTypeType();
//        for(com.vividsolutions.jts.geom.Coordinate jtsCoord:jtsLineString.getCoordinates()) {
//            Pos pos = createPos(jtsCoord);
//            ring.getPosOrPointPropertyOrPointRep().add(pos);
//        }
//        return new LinearRing(ring);
//    }
//    private String createId() {
//        return "_"+UUID.randomUUID().toString();
//    }
//    public Pos createPos(com.vividsolutions.jts.geom.Coordinate jtsCoord) {
//        DirectPositionTypeType directPos = createDirectPositionType(jtsCoord);
//        Pos pos = new Pos(directPos);
//        return pos;
//    }
//    public DirectPositionTypeType createDirectPositionType(com.vividsolutions.jts.geom.Coordinate jtsCoord) {
//        DirectPositionTypeType pos=new DirectPositionTypeType();
//        pos.getValue().add(jtsCoord.x);
//        pos.getValue().add(jtsCoord.y);
//        return pos;
//    }
//    public PointPropertyTypeType createPointPropertyType(com.vividsolutions.jts.geom.Coordinate jtsCoord) {
//        Pos pos=createPos(jtsCoord);
//        PointTypeType point=new PointTypeType();
//        point.setId(createId());
//        point.setPos(pos);
//        Point pointEle=new Point(point);
//        PointPropertyTypeType ret=new PointPropertyTypeType();
//        ret.setPoint(pointEle);
//        return ret;
//    }

}
