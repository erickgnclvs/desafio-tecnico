/*
 * An XML document type.
 * Localname: getEntesDeclaradosUtilidadePublicaEstadual
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getEntesDeclaradosUtilidadePublicaEstadual(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetEntesDeclaradosUtilidadePublicaEstadualDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetEntesDeclaradosUtilidadePublicaEstadualDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETENTESDECLARADOSUTILIDADEPUBLICAESTADUAL$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEntesDeclaradosUtilidadePublicaEstadual");
    
    
    /**
     * Gets the "getEntesDeclaradosUtilidadePublicaEstadual" element
     */
    public br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadual getGetEntesDeclaradosUtilidadePublicaEstadual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadual target = null;
            target = (br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadual)get_store().find_element_user(GETENTESDECLARADOSUTILIDADEPUBLICAESTADUAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEntesDeclaradosUtilidadePublicaEstadual" element
     */
    public void setGetEntesDeclaradosUtilidadePublicaEstadual(br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadual getEntesDeclaradosUtilidadePublicaEstadual)
    {
        generatedSetterHelperImpl(getEntesDeclaradosUtilidadePublicaEstadual, GETENTESDECLARADOSUTILIDADEPUBLICAESTADUAL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getEntesDeclaradosUtilidadePublicaEstadual" element
     */
    public br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadual addNewGetEntesDeclaradosUtilidadePublicaEstadual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadual target = null;
            target = (br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadual)get_store().add_element_user(GETENTESDECLARADOSUTILIDADEPUBLICAESTADUAL$0);
            return target;
        }
    }
}
